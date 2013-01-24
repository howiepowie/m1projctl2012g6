# Exemples donnes dans le rapport.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "Chameaux3.net"
	graphe; todot "Chameaux3.dot"
	ctltodot EF(\$N0 && \$N1 && \$N2 && \$B4 && \$B5 && \$B6) "Chameaux3 ctl.dot"
	Justifie EF(\$N0 && \$N1 && \$N2 && \$B4 && \$B5 && \$B6) 0; Justifietodot EF(\$N0 && \$N1 && \$N2 && \$B4 && \$B5 && \$B6) 0 "Chameaux3 justifie.dot"
	stop
END_PARAMS