(ns alfa.engine.invitees
  (:require [clojure.string :as cs]))

(def berkas "/Users/dimassaputra/Code/wedding/alfa/resources/public/data/undangan.edn")

(defn trim-space [string]
  (cs/replace string #" " ""))

(defn add-invitees [name]
  (spit berkas {name  (str (->> name
                                           (cs/lower-case)
                                           (trim-space))
                                          "010203")}
        :append true))

