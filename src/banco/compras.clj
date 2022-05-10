(ns banco.compras)

(def compra1 {
              :data "1010"
              :valor 500
              :estabelecimento "solo"
              :categoria "compras"
              :cartão 5649465453
              })

(def compra2 {
              :data            "2020"
              :valor           500.30
              :estabelecimento "solo"
              :categoria       "compras"
              :cartão          65956
              })

(defn todos-as-compras []
  [compra1, compra2])
;
;DATA	VALOR	ESTABELECIMENTO	CATEGORIA	CARTÃO
;2022-01-01	129.90	Outback	Alimentação	1234 1234 1234 1234
;2022-01-02	260.00	Dentista	Saúde	1234 1234 1234 1234
;2022-02-01	20.00	Cinema	Lazer	1234 1234 1234 1234
;2022-01-10	150.00	Show	Lazer	4321 4321 4321 4321
;2022-02-10	289.99	Posto de gasolina	Automóvel	4321 4321 4321 4321
;2022-02-20	79.90	iFood	Alimentação	4321 4321 4321 4321
;2022-03-01	85.00	Alura	Educação	4321 4321 4321 4321
;2022-01-30	85.00	Alura	Educação	1598 1598 1598 1598
;2022-01-31	350.00	Tok&Stok	Casa	1598 1598 1598 1598
;2022-02-01	400.00	Leroy Merlin	Casa	1598 1598 1598 1598
;2022-03-01	50.00	Madero	Alimentação	6655 6655 6655 6655
;2022-03-01	70.00	Teatro	Lazer	6655 6655 6655 6655
;2022-03-04	250.00	Hospital	Saúde	6655 6655 6655 6655
;2022-04-10	130.00	Drogaria	Saúde	6655 6655 6655 6655
;2022-03-10	100.00	Show de pagode	Lazer	3939 3939 3939 3939
;2022-03-11	25.90	Dogão	Alimentação	3939 3939 3939 3939
;2022-03-12	215.87	Praia	Lazer	3939 3939 3939 3939
;2022-04-01	976.88	Oficina	Automóvel	3939 3939 3939 3939
;2022-04-10	85.00	Alura	Educação	3939 3939 3939 3939