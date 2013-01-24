# Exemples donnes dans le rapport.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "aspirateur.net"
	graphe; todot "aspirateur.dot"
	ctltodot EF(\$Propre1 && \$Propre2) "aspirateur ctl.dot"
	Justifie EF(\$Propre1 && \$Propre2) 6; Justifietodot EF(\$Propre1 && \$Propre2) 6 "aspirateur justifie.dot"
	stop
END_PARAMS