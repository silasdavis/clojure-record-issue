(ns clojure-record-issue.core-test
  (:require [clojure.test :refer :all]
            [clojure-record-issue.protocol :refer :all]
            [clojure-record-issue.record :refer :all]
            [clojure-record-issue.core :refer :all]))

(deftest a-test
  (is (= "a test"
         (foo (->ARecord nil)))))

(deftest b-test
  (is (= "b test"
         (foo
          (->BRecord nil)))))

(deftest map-test
  (is (= "map test"
         (foo {:map 2}))))
