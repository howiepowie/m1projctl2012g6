# Exemples donnees dans le rapport.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "chemin.net"
	graphe; todot "chemin.dot"
	Justifie E(!\$D U \$D) 0; Justifietodot E(!\$D U \$D) 0 "preuve chemin 1.dot"
	Justifie A(!\$D U \$D) 0; Justifietodot A(!\$D U \$D) 0 "preuve chemin 2.dot"
	Justifie EF(\$D) 0; Justifietodot EF(\$D) 0 "preuve chemin 3.dot"
	Justifie AF(\$D) 0; Justifietodot AF(\$D) 0 "preuve chemin 4.dot"
	load "chemin2.net"
	graphe; todot "chemin2.dot"
	Justifie EG(\$D) 0; Justifietodot EG(\$D) 0 "preuve chemin 5.dot"
	Justifie AG(\$D) 0; Justifietodot AG(\$D) 0 "preuve chemin 6.dot"
	stop
END_PARAMS