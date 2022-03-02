# Trivial

## Problema 0
Extraemos el código duplicado a un único método "nuevaPosicionJugador",
al que llamamos desde ambos sitios.

Creamos test unitario "si_al_principio_saco_un_1_voy_a_casilla_1()"

## Problema 1
Creamos las condiciones de jugadores en el método esJugable(). Para comprobarlo realizo un test para ver si el número de jugadores es menor o igual a 2.

## Problema 2
Creamos la condición de más de 6 jugadores en el método esJugable(). En el test que he creado se comprueba que haya más de seis jugadores.

## Problema 3
En tirarDado() colocamos el if de forma que el jugador pueda salir de la cárcel. Lo comprueblo en los test con salirCarcel() donde el jugador sale al acertal la pregunta.

## Problema 4
En el launcher cambio la variable noGanador por ganador y cuando se de se acabe la partida.

## Problema 5
Selecciono el código para pasar al siguiente jugador en la clase "Game" y hago un extract method y lo voy cambiando en todos los lugares donde esté.