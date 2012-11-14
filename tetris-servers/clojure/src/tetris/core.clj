(ns tetris.core
    "TODO: write your tetris logic here")


(defn default-response [figure x y glass]
    { :left     0
      :right    0
      :rotate   0
      :drop     false })


(defn next-move [figure x y glass]
    (merge
        (default-response figure x y glass) 
        ; todo: add your moves and merge them with defaults
        {}))


(defn tetris [figure x y glass]
    (println (str "request: figure=" figure ", x=" x " ,y=" y ", glass" glass))
    
    (let [move (next-move figure x y glass)
          out (str "left=" (:left move) ", right="  (:right  move) ", "
                   "rotate=" (:rotate move) (if (:drop   move) ", drop"))]

        (println (str "response: " out)) 
        out))
