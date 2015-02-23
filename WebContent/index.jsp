<html>
<body>
	Bem vindo ao nosso gerenciador de empresas!
	<br />

	<form action="novaEmpresa" method="POST">
		Nome: <input type="text" name="nome" /><br /> <input type="submit"
			value="Enviar" />
	</form>

	<form action="login" method="POST">
		E-mail: <input type="email" name="email" /><br /> Senha: <input
			type="password" name="senha" /><br /> <input type="submit"
			value="Enviar" />
	</form>

	<form action="logout" method="post">
		<input type="submit" value="Logout" />
	</form>

</body>
</html>