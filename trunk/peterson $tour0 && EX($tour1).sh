# Justifie que pour l'etat 1 $tour0 est vraie et qu'il a un voisin
# pour lequel $tour1 est vraie.
#
# .dot produits:
# - "peterson.dot": le graphe.
# - "peterson \$tour0 && EX(\$tour1).dot": les etats validant la formule.
# - "peterson \$tour0 && EX(\$tour1) just.dot": la justification.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "peterson.net"
	graphe; todot "peterson.dot"
	ctl \$tour0 && EX(\$tour1)
	ctltodot \$tour0 && EX(\$tour1) "peterson \$tour0 && EX(\$tour1).dot"
	Justifie \$tour0 && EX(\$tour1) 1
	Justifietodot \$tour0 && EX(\$tour1) 1 "peterson \$tour0 && EX(\$tour1) just.dot"; stop
END_PARAMS
