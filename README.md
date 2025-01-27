# 🎮 Projekt Gry w Javie

Witamy w Projekcie Gry w Javie! Ten projekt to prosta gra zaimplementowana w Javie z użyciem Swing do interfejsu graficznego.

## 📂 Struktura Katalogów

Workspace zawiera następujące katalogi:

- `📁 src`: Katalog na kod źródłowy
- `📁 bin`: Katalog, w którym generowane są skompilowane pliki

## 🚀 Jak Zacząć

Aby rozpocząć pracę z tym projektem w Visual Studio Code, wykonaj następujące kroki:

1. Otwórz folder projektu w VS Code.
2. Upewnij się, że masz zainstalowany Java Extension Pack.
3. Otwórz folder `src`, aby przeglądać i edytować kod źródłowy.
4. Otwórz i uruchom plik `Program.java`.

## 👥 Autorzy

- Jakub Liszewski
- Michał Kuznicki

## 📄 Opis Klas

- `Program`: Główna klasa uruchamiająca aplikację. Tworzy okno gry i inicjalizuje planszę.
- `Plansza`: Klasa odpowiedzialna za rysowanie elementów gry i obsługę interakcji z użytkownikiem.
- `Kulka`: Klasa reprezentująca piłeczkę. Odpowiada za jej ruch i kolizje z innymi obiektami.
- `Belka`: Klasa reprezentująca belkę, którą gracz steruje.
- `Cegielka`: Klasa reprezentująca cegiełki, które piłeczka może zbić.
- `SilnikKulki`: Klasa odpowiedzialna za animację piłeczki, dziedzicząca po `Thread`.