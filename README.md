# [codingstreams.tv](https://codingstreams.tv)

-----------------------------
![Status](https://img.shields.io/badge/Status-Experimental-important)
[![Build Status](https://travis-ci.org/Seputaes/codingstreams.tv.svg?branch=master)](https://travis-ci.org/Seputaes/codingstreams.tv)
[![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://seputaes.mit-license.org/)
[![made-with-java](https://img.shields.io/badge/Made%20with-Java-1f425f.svg)](https://en.wikipedia.org/wiki/Java_%28programming_language%29)
[![GitHub issues](https://img.shields.io/github/issues/Seputaes/codingstreams.tv.svg)](https://GitHub.com/seputaes/codingstreams.tv/issues/)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat)](http://makeapullrequest.com)
[![Discord](https://img.shields.io/discord/481539443170344961?logo=discord&label=Discord)](https://sep.gg/discord)


[codingstreams.tv](https://codingstreams.tv) is a website for collecting and showcasing live streamers
who regularly or otherwise stream live coding, programming, or related content. The streamers are primarily
sourced from the [Awesome Developer Streams](https://github.com/bnb/awesome-developer-streams) curated list,
but has diverged in some areas. codingstreams.tv has no affiliation with this separate project.

## Adding or Modifying a Streamer

If you're looking to add a new streamer to the list, it is recommended to so so via pull request on the 
[Awesome Developer Streams](https://github.com/bnb/awesome-developer-streams) GibHub project, and this repo
will be updated in short time -- that way it helps keep things synced as much as possible.

If you notice some data is inaccurate in this repository, feel free to open a PR or issue accordingly.

## Contributing

Pull requests are always welcome! It is recommended that an issue be opened first describing the 
bugfix/improvement/feature to ensure a smooth pull request process.

### Local Development

**codingstreams.tv** is build as a Java application running on *AWS Lambda*, accessed through
API Gateway. The easiest way to get started working with the application locally is to use 
the [AWS SAM](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/what-is-sam.html) framework.

Once installed, you can spin up the stack locally using:

```bash
sam build --template-file configuration/cloudformation/template.yml --base-dir .
sam local start-api
```

You can then browse to [http://localhost:3000](http://localhost:3000) in your browser to view the application.
Any changes you make and be re-built with the `sam build` command above, and the changes will be reflected
automatically on the next page load.
