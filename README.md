# Conversor de Monedas 💱
Aplicación de consola en Java que permite convertir valores entre distintas monedas en tiempo real utilizando la API de ExchangeRate-API.

---

## 🚀 Características
- Conversión entre varias monedas populares (USD, ARS, BRL, COP, etc.).
- Obtención automática de tasas de cambio en tiempo real.
- Uso de HttpClient nativo de Java 11+.
- Manejo de API mediante Gson y un modelo `record` para la deserialización.
- Sistema de caché para evitar múltiples llamadas innecesarias a la API (En la version 2).
- Menú interactivo en consola.

---

## 🔧 Requisitos
- Java 17 o superior
- Conexión a Internet
- Biblioteca Gson (si usas Maven o Gradle puedes agregarla como dependencia)

## 📡 Api Utilizada
Este proyecto utiliza: https://www.exchangerate-api.com/  
Genere su token para utilizar el aplicativo

## 🛠 Instalación

1. Clona este repositorio:
   ```bash
   git clone https://github.com/Duckdrunk/ConversorMonedas.git

2. Entra al archivo ConsultarMoneda.java y reemplace con su token generado.  
3. Ejecute el aplicativo.

   
