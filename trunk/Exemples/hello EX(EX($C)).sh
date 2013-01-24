# Justifie que l'etat 0 permet d'acceder a des etats qui
# donnent acces a des etats pour lesquels $C est vraie.
#
# .dot produits:
# - "hello.dot": le graphe.
# - "hello EX($C).dot": etats ayant un etat contenant $C comme voisin.
# - "hello EX(EX($C)).dot": etats ayants un des etats precedents comme voisin.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "hello.net"
	graphe; todot "hello.dot"
	ctl EX(EX(\$C)); ctl EX(\$C)
	ctltodot EX(\$C) "hello EX(\$C).dot"; ctltodot EX(EX(\$C)) "hello EX(EX(\$C)).dot"
	Justifie EX(EX(\$C)) 0
	Justifietodot EX(EX(\$C)) 0 "justifie.dot"; stop
END_PARAMS