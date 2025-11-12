;namespace
(ns projeto.core)

(defn informacoes []
  (print "\n===== Informacoes do projeto =====\n")
  (print"\nProjeto desenvolvido para a disciplina de")
  (print"\nParadigmas de Linguagens de Programacao")
  (print"\nem 2025.2")
  (print"\nna Universidade Catolica de Pernambuco (UNICAP)\n")

  (print "\nGrupo:")
  (print "\nJulia Souto\nGabriel Martins\nGabriela Lemos\nMaria Luiza Ribeiro\nMatheus Verissmo\nRoberto Regis\n")

  )

(defn menuInicial []
  (print "\n===== Menu Inicial =====\n")
  (print "\n1- Fazer Login")
  (print "\n2- Informacoes do projeto")
  (print "\n0- Terminar programa")

  (loop []
    (print "\n\nEscolha sua opcao: ")
    (flush)
    (let [userinput (read-line)]
      (cond
        (= userinput "1") (do
                            (print "um\n")
                            (recur))
        (= userinput "2") (do
                            (informacoes)
                            (recur))
        (= userinput "0") (do
                            (print "\nTerminando programa\n")
                            (flush)
                            (System/exit 0)
                            (recur))
        :else (do 
                (print "\nEscolha um numero valido.\n") 
                (recur))
        )
      )
    )
  )

(defn -main []
  (print "===== Projeto: Paradigmas do Sucesso =====\n")

  (menuInicial))