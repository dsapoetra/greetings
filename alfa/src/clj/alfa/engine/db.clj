(ns alfa.engine.db)

(def berkas "/Users/dimassaputra/Code/wedding/alfa/resources/public/data/undangan.edn")

(defn check-user? [name]
  (if (empty? (filter #(not (nil? %)) (map #(% name) (read-string (slurp berkas)))))
    false
    true))

(defn check-password [name password]
  (let [res (first (filter #(not (nil? %)) (map #(% name) (read-string (slurp berkas)))))]
    (if (true? (check-user? name))
      (if (= res password)
        true
        false)
      false)))