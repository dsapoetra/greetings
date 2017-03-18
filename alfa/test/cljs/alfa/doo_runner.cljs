(ns alfa.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [alfa.core-test]))

(doo-tests 'alfa.core-test)

