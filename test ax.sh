java -jar modelprojet.jar << -END_PARAMS
	shell
	load "peterson.net"
	graphe; todot "peterson.dot"
	Justifie AX(\$tour0 && \$tour0) 0; Justifietodot AX(\$tour0 && \$tour0) 0 "test ax 1.dot"
	Justifie AX(\$tour0 || \$tour0) 0; Justifietodot AX(\$tour0 || \$tour0) 0 "test ax 2.dot"
	Justifie AX(\$tour0 -> \$tour0) 0; Justifietodot AX(\$tour0 -> \$tour0) 0 "test ax 3.dot"
	Justifie AX(\$tour0 <-> \$tour0) 0; Justifietodot AX(\$tour0 <-> \$tour0) 0 "test ax 4.dot"
	stop
END_PARAMS