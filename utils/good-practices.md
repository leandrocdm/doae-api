# Boas Práticas Git

## Branches

Para o desenvolvimento, criar a branch `dev` a partir da `master` e as branches
de mudança a partir da `dev`.

Os nomes das branches têm que indicar o tipo da mudança `[bug, feature]` e o
principal componente da mesma, sendo dividos por uma barra `/` e sempre em lower-case.

Ex: `bug/dashboard`, `feature/menu-lateral`

## Commits

Ser específico porém direto nos commits, segmentar o máximo possível para que
seja fácil retornar uma alteração sem a quebra de outra funcionalidade e respeitar
o limite de 50 caracteres no commit.

Caso queira dar mais informações, quebrar a linha duas vezes e inserir uma descrição do commit com no máximo 72 caracteres.

É recomendável também o uso do `git add -p` quando possível.

## Merges

### Fluxo dos commits e merges

`git checkout -b [nome-da-branch]` (Cria e redireciona para a branch)

`** Commits de desenvolvimento **`

`git pull` (Atualiza a branch local caso há mudanças no repositório)

`git push origin [nome-da-branch]` (Atualiza a branch de mudança no repositório)

`git checkout dev` (Redireciona para branch de dev)

`git pull`

`git merge[nome-da-branch]` (Insere as alterações da branch de mudança para dev)

`git push origin dev` (Atualiza a brach de dev no repositório)
