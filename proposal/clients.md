# Kubernetes client libraries proposal
Kubernetes officially support Go and [Python client](https://github.com/kubernetes-incubator/client-python) libraries right now. Go client is
developed and extracted from main kubernetes repositories. On the other hand, python
client base is from OpenAPI and generated code using [swagger-codegen](https://github.com/swagger-api/swagger-codegen). By generating the
API and Model part of the client, updating the client and tracking changes from main
repositories would be much easier.

Client python development process can be repeated for other languages. Supporting a
basic set of languages would help the community to build more tools and applications
based on kubernetes.

# Languages
The proposal is to support *Java*, *PHP*, *Ruby*, *C#*, and *Javascript* in addition
to already supported libraries. There are good clients for each of these languages, 
but having a basic supported client would even help those client libraries to focus 
on their interface and delegate transport and config layer to this basic client.

# Development process
Development would be based on a generated client using OpenAPI and [swagger-codegen](https://github.com/swagger-api/swagger-codegen).
The basic functionality such as loading config, watch, etc. would be added on top
of this generated client. The idea is to develop transportation and configuration
layer and do not modify O(N) generated files (such as API and models). The releases
would be in alpha, beta and stable stages according to these requirements:

### Alpha Version
Alpha version should support loading config from kube config file and the basic
API calls such as list pods should work.

### Beta Version
Minimum requirement for beta version is supporting watch and exec calls as they
are not normally supported out of the box from [swagger-codegen](https://github.com/swagger-api/swagger-codegen).

### Stable Version (WIP)
The client should be stable and the interface should be stable and should
not change after a stable release.

# Kubernetes Incubator
All of these client will start as a repo in 
[kubernetes incubator](https://github.com/kubernetes/community/blob/master/incubator.md)
project.

Proposed repos are 

- client-common: common codes such as spec preporcessing, etc.
- client-[lang]: where lang is one of java, csharp, js, php, ruby

Incubation process requirements:

- Champion: TBD
- Sponsor: TBD
- sig: sig-api-machinery

#Support
All of these clients are going to be supported by kuberenetes 
[API Machinery special interest group](https://github.com/kubernetes/community/tree/master/sig-api-machinery).
