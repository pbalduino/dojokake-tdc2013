(ns kake.core-test
  (:require [clojure.test :refer :all]
            [kake.core :refer :all]))

(deftest PokerHands
  (testing "Possuo 5 elementos"
    (let [lista [1 2 3 4 5]]
      (is (= (count lista) 5))))

  (testing "tenho uma dupla de 5"
    (let [mao ["5P" "5C" "QC" "KO" "JO"]]
      (is (= (umadupla? mao) true))))

  (testing "tenho uma dupla"
    (let [mao ["5P" "KC" "QC" "QO" "JO"]]
      (is (= (umadupla? mao) true))))

  (testing "tenho duas duplas"
    (let [mao ["5P" "5C" "QC" "QO" "JO"]]
      (is (= (duasduplas? mao) true))))

  (testing "nao tenho uma dupla de 5"
    (let [mao ["4P" "5C" "QC" "KO" "JO"]]
      (is (= (umadupla? mao) false))))
)