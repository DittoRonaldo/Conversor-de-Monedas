# Conversor-de-Monedas
Primer proyecto back end Alura, Conversor de Moneda


Conversor de Monedas 💸
¡Bienvenido al Conversor de Monedas! 🚀 Esta pequeña app en Java usa la API de ExchangeRate para convertir tus monedas favoritas al instante. Solo tienes que decirnos cuál moneda quieres, ¡y listo! 🎩✨

¿Cómo funciona? 🛠️
Elige una Moneda: Al ejecutar el programa, te pedirá que ingreses un código de moneda. Puede ser algo como ARS (Peso argentino), BRL (Real brasileño) o USD (Dólar estadounidense). Escribe el código y presiona Enter.

Solicitud de Datos a la API: Nuestro amiguito HttpClient hará una solicitud HTTP a la API de ExchangeRate para obtener todas las tasas de cambio respecto al dólar (USD). 🌍

Filtrado de la Respuesta JSON: Gracias a la biblioteca Gson, nuestro programa lee solo el valor de la moneda que pediste, sin confundirse con el montón de otras monedas en el JSON. 📜🔍

Mostrar la Tasa de Cambio: Si todo va bien, verás el tipo de cambio para la moneda que pediste. ¡Sin rodeos ni complicaciones! 💰 Si ingresaste una moneda que no está en la lista, te avisaremos para que pruebes con otra. 🚫

¿Qué necesitas? 📋
Java 11+ (ya que usamos HttpClient)

Gson para trabajar con el JSON. Si usas Maven, asegúrate de incluir esta dependencia:

xml
Copy code
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>
Ejemplo de Uso 🎉
Cuando ejecutes el programa, verás algo como esto:

plaintext
Copy code
Ingrese moneda (ejemplo: ARS, BOB, BRL, CLP, COP, USD):
Escribe el código de tu moneda favorita (por ejemplo, BRL), y verás algo como:

plaintext
Copy code
La tasa de cambio para BRL es: 5.4321
¡Y eso es todo! Diviértete convirtiendo y aprendiendo más sobre las monedas del mundo 🌎💸
