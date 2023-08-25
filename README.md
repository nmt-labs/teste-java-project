## Teste

não pode esquecer de:

- habiliter testes um JUnit Jupiter na aba Testing
- importar as classes de @Test `(import org.junit.jupiter.api.Test;)` e de assertEquals `(import static org.junit.jupiter.api.Assertions.*;)` 

## Criar projeto Java

- abrir paleta de comando `(Ctrl + Shift + P)`
- iniciar projeto java

e pronto, já vem com as pastar separadinhas pra mim

## Se .gitignore não funcionar
```
git rm -r --cached .
git status
git add .
git commit -m "fixed untracked files" 
```