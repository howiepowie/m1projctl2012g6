# Exemples donnes dans le rapport.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "operateur.net"
	graphe; todot "operateur.dot"
	Justifie EX(\$B) && EX(\$C) 0; Justifietodot EX(\$B) && EX(\$C) 0 "preuve operateur 1.dot"
	Justifie EX(\$B) || EX(\$C) 0; Justifietodot EX(\$B) || EX(\$C) 0 "preuve operateur 2.dot"
	Justifie EX(\$D) -> EX(\$C) 0; Justifietodot EX(\$D) -> EX(\$C) 0 "preuve operateur 3.dot"
	Justifie EX(\$B) <-> EX(\$C) 0; Justifietodot EX(\$B) <-> EX(\$C) 0 "preuve operateur 4.dot"
	stop
END_PARAMS