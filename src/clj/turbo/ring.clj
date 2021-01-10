(ns turbo.ring)

(defn turbo-frame?
  "Check if `request` has the `turbo-frame` header."
  [request]
  (-> (get-in request [:headers "turbo-frame"])
      (boolean)))

(defn turbo-stream?
  "Check if `request` has the `turbo-stream` header."
  [request]
  (-> (get-in request [:headers "turbo-stream"])
      (boolean)))

(defn wrap-turbo-frame
  "Add the `turbo-frame` header to the response if the request has a
  `turbo-frame` header."
  [handler]
  (fn [request]
    (let [turbo-header "text/html; turbo-frame"
          response (handler request)]
      (if (turbo-frame? request)
        (assoc-in response [:headers "Content-Type"] turbo-header)
        response))))

(defn wrap-turbo-stream
  "Add the `turbo-stream` header to the response if the request has a
  `turbo-stream` header."
  [handler]
  (fn [request]
    (let [turbo-header "text/html; turbo-stream"
          response (handler request)]
      (if (turbo-stream? request)
        (assoc-in response [:headers "Content-Type"] turbo-header)
        response))))
