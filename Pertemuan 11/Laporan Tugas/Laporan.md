# Laporan Tugas Pertemuan 11

## Source Code Binatang

--Screenshot Code--

<img src = "Binatang.png">
	
## Source Code IKarnivora

--Screenshot Code--

<img src="IKarnovora.png">

## Source Code IHerbivora

--Source Code--

--Screenshot Code--

<img src="IHerbivora.png">

## Source Code Singa


--Screenshot Code--

<img src="Singa.png">

## Source Code Keledai

--Screenshot Code--

<img src="Keledai.png">

## Source Code Gorilla

--Screenshot Code--

<img src="Gorilla.png">

## Source Code Main

--Screenshot Code--

<img src="Main.png">

## Penjelasan Code Program

Di dalam code program di atas meiliki 3 class child yaitu Singa, Keledai, dan Gorilla yang mengextends abstrak class Binatang yang berarti class Binatang adalah class parent. Di dalam tiga class child ini memiliki konstruktor berparameter.

Di dalam Class Binatang sendiri memiliki beratribut nama dan jumlah kaki serta memiliki method setter, getter atribut dan method abstrak displayBinatang(). 

kemudian terdapat class interface IKarnivora yang bermethod (abstrak) displayMakanan() diimplementasikan class Singa dan Gorilla.

dan terakhir terdapat class interface IKHerbivora yang bermethod (abstrak) displayMakanan() diimplementasikan class Keledai dan Gorilla.

jadi Gorilla mengimplementasi 2 class interface yaitu, IKarnivora dan Iherbivora. 