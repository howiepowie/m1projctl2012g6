# Exemples donnes dans le rapport.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "indiana.net"
	graphe; todot "indiana.dot"
	ctltodot EF(\$D0 && \$D1 && \$D2 && \$D3 && \$D4) "indiana ctl.dot"
	Justifie EF(\$D0 && \$D1 && \$D2 && \$D3 && \$D4) 0; Justifietodot EF(\$D0 && \$D1 && \$D2 && \$D3 && \$D4) 0 "indiana justifie.dot"
	stop
END_PARAMS