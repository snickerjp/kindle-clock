Kindle Clock
=====================================

> [!IMPORTANT]
> This repository is NOT under mentenance.
> Please consider to use [Go implementation: kindle-clock-go](https://github.com/y-yu/kindle-clock-go).


![CI](https://github.com/y-yu/kindle-clock/workflows/CI/badge.svg)

CFW Kindle wallpaper generating server implementation.

![Example image](https://y-yu.github.io/kindle-clock/example.jpg)

## Hardware requirements

- [Nature Remo](https://en.nature.global/products/)
- [Awair](https://www.getawair.com/home/element)

## Deploy to [Render](https://render.com/)

- [RenderでScala + PlayなWebアプリを動かす](https://zenn.dev/yyu/articles/b927b46febef7f) (Japanese only)

<!--
## Deploy to Heroku

1. Create Heroku app whose name is `kindle-clock` by the command:
    ```console
    $ heroku create -n kindle-clock
    ```
    - This name is set as `herokuAppNameRemote` in `build.sbt` so you can change it if you edit `build.sbt`
2. Add [Heroku Redis](https://elements.heroku.com/addons/heroku-redis) to (1) Heroku app
    - Then the Redis environment variable (`REDIS_TLS_URL`) is set automatically
    - You can show the URL by the command:
      ```console
      $ heroku config -a kindle-clock
      REDIS_TLS_URL:           rediss://***.compute-1.amazonaws.com:10070
      REDIS_URL:               redis://***.compute-1.amazonaws.com:10069
      ```
3. Set at least these environment variables to (1) Heroku app:
    - `NATURE_REMO_OAUTH_TOKEN`
    - `AWAIR_OAUTH_TOKEN`
    - `OPEN_WEATHER_MAP_ID`
    - `OPEN_WEATHER_MAP_APP_ID`
    - `AUTH_TOKEN`
        - In strictly speaking, this application will work if `AUTH_TOKEN` is not set, indeed but your data should be forbidden for unintentional people. So I strongly recommend you to set the environment variable
    - `APPLICATION_SECRET`
        - [Play Framework](https://www.playframework.com/) requirement
        - I got the default value as follows: 
        ```console
        $ head -c 256 /dev/urandom | shasum -a 256
        ```
   ```console
   $ heroku config:set \
     NATURE_REMO_OAUTH_TOKEN=<<YOUR_NATURE_REMO_OAUTH_TOKEN>> \
     AWAIR_OAUTH_TOKEN=<<YOUR_AWAIR_OAUTH_TOKEN>> \
     OPEN_WEATHER_MAP_ID=<<YOUR_LOCATION_ID>> \
     OPEN_WEATHER_MAP_APP_ID=<<YOUR_APP_ID>> \
     AUTH_TOKEN=<<YOUR_AUTH_TOKEN>> \
     APPLICATION_SECRET=<<YOUR_APPLICATION_SECRET>>
   ```
4. Run the following command:
   ```console
   $ ./sbt stage deployHeroku
   ```
5. Edit `client/launch.sh` for your sever information, copy it to your Kindle and set up `cron`

-->

## How to run in local

You have to install

- Docker and docker-compose
- JDK 11

then:

```console
$ export NATURE_REMO_OAUTH_TOKEN=<<YOUR_NATURE_REMO_OAUTH_TOKEN>> \
AWAIR_OAUTH_TOKEN=<<YOUR_AWAIR_OAUTH_TOKEN>> \
OPEN_WEATHER_MAP_ID=<<YOUR_LOCATION_ID>> \
OPEN_WEATHER_MAP_APP_ID=<<YOUR_APP_ID>> \
AWAIR_CACHE_EXPIRE_SECONDS=30 \
AWAIR_INTERVAL_MINUTES=5

$ ./sbt "primary / run"
```
