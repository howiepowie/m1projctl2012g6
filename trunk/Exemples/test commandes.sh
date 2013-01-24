# Fait toutes les commandes.
#
# .dot produits:
# - "hello.dot": le graphe.
# - "test commandes $B1 || $B2.dot"
# - "test commandes EX(EX($C)).dot"
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "hello.net"
	graphe; todot "hello.dot"
	look 0; look 1; look 2
	succ 0; succ 1; succ 2
	ctl \$A1; ctl \$A2; ctl \$C; ctl \$B1; ctl \$B2
	ctl \$A1 && \$A2; ctl \$B1 || \$B2
	ctl initial; ctl dead
	ctl \$A1 0; ctl \$A1 1; ctl \$A1 2
	ctl initial 0; ctl initial 1
	ctltodot \$B1 || \$B2 "test commandes \$B1 || \$B2.dot"
	Justifie \$B1 || \$B2 1
	Justifie EX(EX(\$C)) 0
	Justifietodot EX(EX(\$C)) 0 "test commandes EX(EX(\$C)).dot"
	stop
END_PARAMS