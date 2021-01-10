(ns turbo.core
  (:require
   ["@hotwired/turbo" :as turbo]))

(defn on-click!
  "Evaluate `callback` when the turbo:click event is triggered."
  [callback]
  (js/document.addEventListener "turbo:click" callback))

(defn on-before-visit!
  "Evaluate `callback` when the turbo:before-visit event is triggered."
  [callback]
  (js/document.addEventListener "turbo:before-visit" callback))

(defn on-visit!
  "Evaluate `callback` when the turbo:visit event is triggered."
  [callback]
  (js/document.addEventListener "turbo:visit" callback))

(defn on-submit-start!
  "Evaluate `callback` when the turbo:submit-start event is triggered."
  [callback]
  (js/document.addEventListener "turbo:submit-start" callback))

(defn on-before-fetch-request!
  "Evaluate `callback` when the turbo:before-fetch-request event is triggered."
  [callback]
  (js/document.addEventListener "turbo:before-fetch-request" callback))

(defn on-before-fetch-response!
  "Evaluate `callback` when the turbo:before-fetch-response event is triggered."
  [callback]
  (js/document.addEventListener "turbo:before-fetch-response" callback))

(defn on-submit-end!
  "Evaluate `callback` when the turbo:submit-end event is triggered."
  [callback]
  (js/document.addEventListener "turbo:submit-end" callback))

(defn on-before-cache!
  "Evaluate `callback` when the turbo:before-cache event is triggered."
  [callback]
  (js/document.addEventListener "turbo:before-cache" callback))

(defn on-before-render!
  "Evaluate `callback` when the turbo:before-render event is triggered."
  [callback]
  (js/document.addEventListener "turbo:before-render" callback))

(defn on-before-stream-render!
  "Evaluate `callback` when the turbo:before-stream-render event is
  triggered."
  [callback]
  (js/document.addEventListener "turbo:before-stream-render" callback))

(defn on-render!
  "Evaluate `callback` when the turbo:render event is triggered."
  [callback]
  (js/document.addEventListener "turbo:render" callback))

(defn on-load!
  "Evaluate `callback` when the turbo:load event is triggered."
  [callback]
  (js/document.addEventListener "turbo:load" callback))

(defn preview-visible?
  "check if a preview is displayed from cache."
  []
  (js/document.documentElement.hasAttribute "data-turbo-preview"))

(defn visit!
  "Performs an Application Visit to the given `location` with the
  specified `opts`

  ```
  location : string (url or path)
  opts     : {:action :advance | :replace}
  ```
  "
  ([location]
   (turbo/visit location))
  ([location opts]
   (turbo/visit location (clj->js opts))))

(defn clear-cache!
  "Removes all entries from the Turbo Drive page cache. Call this when
  state has changed on the server that may affect cached pages."
  []
  (turbo/clearCache))

(defn set-progress-bar-delay!
  "Sets the delay after which the progress bar will appear during
  navigation, in milliseconds. The progress bar appears after 500ms by
  default."
  [delay-in-milliseconds]
  (turbo/setProgressBarDelay delay-in-milliseconds))
