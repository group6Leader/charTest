<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>에코</title>

<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"></c:url>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/sockjs-0.3.min.js"></c:url>"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#sendBtn').click(function() { sendMessage(); });
	});
	
	var sock;
	function sendMessage() {
		sock = new SockJS("http://localhost:9090/www/echo-sockjs");
		sock.onmessage = onMessage;
		sock.onclose = onClose;
		sock.onopen = function() {
			sock.send( $("#message").val() );
		};
	}
	function onMessage(evt) {
		var data = evt.data;
		alert("서버에서 데이터 받음" + data);
		sock.close();
	}
	function onClose(evt) {
		alert("연결 끊김");
	}
</script>
</head>
<body>
    <input type="text" id="message">
    <input type="button" id="sendBtn" value="전송">
</body>
</html>