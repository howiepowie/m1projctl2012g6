# Justifie que l'etat 0 possede un chemin:
# - qui passe par des etats pour lesquels $tour0 est vraie.
# - qui se fini par un etat pour lequel $tour1 est vraie.
#
# .dot produits:
# - "peterson.dot": le graphe.
# - "peterson EU($tour0, $tour1).dot": la justification.
java -jar modelprojet.jar << -END_PARAMS
	shell
	load "peterson.net"
	graphe; todot "peterson.dot"
	Justifie E(\$tour0 U \$tour1) 0
	Justifietodot E(\$tour0 U \$tour1) 0 "peterson EU(\$tour0, \$tour1).dot"; stop
END_PARAMS
