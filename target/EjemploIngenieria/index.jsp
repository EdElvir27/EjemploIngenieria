<!DOCTYPE html>
<html>
<head>
    <title>Ejemplo Ingeniería</title>
</head>
<body>
    <h1>Bienvenido a Ejemplo Ingenieria</h1>
    <form action="ButtonServlet" method="post">
        <button type="submit">Cambiar Color</button>
    </form>
    <form action="FormulaServlet" method="post">
        <select name="figure">
            <option value="circle">Circulo</option>
            <option value="triangle">Triangulo</option>
            <option value="square">Cuadrado</option>
        </select>
        <button type="submit">Obtener Fórmula</button>
    </form>
</body>
</html>
