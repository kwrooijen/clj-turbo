# Clojure Turbo

[![Clojars Project](https://img.shields.io/clojars/v/io.github.kwrooijen/turbo.svg)](https://clojars.org/io.github.kwrooijen/turbo)

## Installation

### package.json

```javascript
{
    "dependencies": {
        "@hotwired/turbo": "^7.1.0",
    }
}
```

## Usage

Read the [Turbo handbook](https://turbo.hotwire.dev/handbook/introduction)

### Ring

The `turbo.ring` namespace provides middleware for both turbo-frame and
turbo-stream. Your HTML routes should make use of this middleware.


- `turbo.ring/wrap-turbo-frame`
- `turbo.ring/wrap-turbo-stream`


### ClojureScript

The `turbo.core` ClojureScript namespaces provides a few wrapper functions for
event listeners and functions.

- `turbo.core/on-click!`
- `turbo.core/on-before-visit!`
- `turbo.core/on-visit!`
- `turbo.core/on-submit-start!`
- `turbo.core/on-before-fetch-request!`
- `turbo.core/on-before-fetch-response!`
- `turbo.core/on-submit-end!`
- `turbo.core/on-before-cache!`
- `turbo.core/on-before-render!`
- `turbo.core/on-before-stream-render!`
- `turbo.core/on-render!`
- `turbo.core/on-load!`
- `turbo.core/preview-visible?`
- `turbo.core/visit!`
- `turbo.core/clear-cache!`
- `turbo.core/set-progress-bar-delay!`

## author / License

Released under the [MIT License] by [Kevin William van Rooijen].

[Kevin William van Rooijen]: https://twitter.com/kwrooijen

[MIT License]: https://github.com/kwrooijen/clj-turbo/blob/master/LICENSE
