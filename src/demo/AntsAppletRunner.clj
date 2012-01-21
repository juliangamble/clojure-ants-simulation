(ns demo.AntsAppletRunner
  (:import
        (javax.swing JApplet JPanel JLabel JFrame))
  (:gen-class
    :post-init post-init
    :main -main))

;------
(compile 'demo.AntsApplet2)

(defn -main []
  (let [applet (new demo.AntsApplet2)]
    (doto (JFrame. "Ants")
      (.add (.getContentPane applet))
      (.pack)
      (.setLocationByPlatform true)
      (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
      (.setVisible true))     
    ))

;(-main "s")