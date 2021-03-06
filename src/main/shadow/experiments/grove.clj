(ns shadow.experiments.grove)

;; just for convenience, less imports for the user

(defmacro defc [& args]
  `(shadow.experiments.grove.components/defc ~@args))

(defmacro << [& body]
  (with-meta `(shadow.experiments.arborist.fragments/html ~@body) (meta &form)))

;; I prefer << but <> looks more familiar to reagent :<>
;; costs nothing to have both, let the user decide
(defmacro <> [& body]
  (with-meta `(shadow.experiments.arborist.fragments/html ~@body) (meta &form)))

(defmacro fragment [& body]
  (with-meta `(shadow.experiments.arborist.fragments/html ~@body) (meta &form)))

(defmacro html [& body]
  (with-meta `(shadow.experiments.arborist.fragments/html ~@body) (meta &form)))

(defmacro svg [& body]
  (with-meta `(shadow.experiments.arborist.fragments/svg ~@body) (meta &form)))