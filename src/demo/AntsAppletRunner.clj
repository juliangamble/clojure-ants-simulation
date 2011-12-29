(ns demo.AntsAppletRunner
  (:import
        (javax.swing JApplet JPanel JLabel JFrame)))

;------
(compile 'demo.AntsApplet2)

(defn -main [s]
  (let [applet (new demo.AntsApplet2)]
    (doto (JFrame. "Ants Applet")
      (.add (.getContentPane applet))
      (.pack)
      (.setLocationByPlatform true)
      (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
      (.setVisible true))     
    ))

(-main "s")