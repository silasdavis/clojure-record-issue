(ns clojure-record-issue.protocol)

(defprotocol AProtocol
  (foo [n]))

(extend-protocol AProtocol
  clojure.lang.IPersistentMap
  (foo [n] "foo called on persistent map"))

(defrecord BRecord [thing]
  AProtocol
  (foo [n] "foo called on BRecord"))