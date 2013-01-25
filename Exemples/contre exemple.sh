# Exemples donnees dans le rapport.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "chemin.net"
	graphe; todot "chemin.dot"
	Justifie EX(\$D) 0; Justifietodot EX(\$D) 0 "contre exemple 1.dot"
	Justifie EX(!\$A) 0; Justifietodot EX(!\$A) 0 "contre exemple 2.dot"
	Justifie EX(!EX(\$A)) 0; Justifietodot EX(!EX(\$A)) 0 "contre exemple 3.dot"
	Justifie \$B 0; Justifietodot \$B 0 "contre exemple 4.dot"
	Justifie !\$A 0; Justifietodot !\$A 0 "contre exemple 5.dot"
	Justifie false 0; Justifietodot false 0 "contre exemple 6.dot"
	Justifie !initial 0; Justifietodot !initial 0 "contre exemple 7.dot"
	Justifie dead 0; Justifietodot dead 0 "contre exemple 8.dot"
	Justifie EX(\$A) 0; Justifietodot EX(\$A) 0 "contre exemple 9.dot"
	Justifie AX(\$A) 0; Justifietodot AX(\$A) 0 "contre exemple 10.dot"
	Justifie E(\$A U \$D) 0; Justifietodot E(\$A U \$D) 0 "contre exemple 11.dot"
	Justifie A(\$A U \$B) 0; Justifietodot A(\$A U \$B) 0 "contre exemple 12.dot"
	Justifie EF(\$A) 1; Justifietodot EF(\$A) 1 "contre exemple 13.dot"
	Justifie AF(\$A) 1; Justifietodot AF(\$A) 1 "contre exemple 14.dot"
	Justifie EG(\$B) 0; Justifietodot EG(\$B) 0 "contre exemple 15.dot"
	Justifie AG(\$B) 0; Justifietodot AG(\$B) 0 "contre exemple 16.dot"
	Justifie \$A && \$B 0; Justifietodot \$A && \$B 0 "contre exemple 17.dot"
	Justifie \$B || \$C 0; Justifietodot \$B || \$C 0 "contre exemple 18.dot"
	Justifie \$A -> \$B 0; Justifietodot \$A -> \$B 0 "contre exemple 19.dot"
	Justifie \$A <-> \$B 0; Justifietodot \$A <-> \$B 0 "contre exemple 20.dot"
	stop
END_PARAMS