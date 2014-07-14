(ns clojure-record-issue.record
  (require [clojure-record-issue.protocol :refer :all]))


(defrecord ARecord [thing]
  AProtocol
  (foo [n] "foo called on ARecord"))