# Conteúdo

## Atribuição de variáveis

Para atribuir variáveis, segue-se a seguinte sintaxe:

```prolog
animal(gato).
animal(cachorro).
```

Executando este script e realizando a consulta `animal(gato).`, o resultado será `true`. Caso passe-se qualquer outro valor que não foi definido anteriormente, o resultado será `false`, e.g. `animal(lebre).`

## Operadores

|  Connective |   Meaning |  Prolog |
|:------------|:----------|:-------:|
| implication |        if |      :- |
| disjunction |        or |       ; |
| conjunction |       and |       , |
|    negation |       not |     \\+ |
|    equality |    equals |       = |
|  inequality | different |    =\\= |

## Comentários

Comentários são iniciados por um `%` no começo da linha, que é ignorada por completo.

## Variáveis e valores

Valores são números inteiros ou então strings iniciadas por letras minísculas.

Variáveis são strings iniciadas por uma letra maiúscula.

## Debugging

Para debugar um programa, dentro do console do prolog, digite `debug.` ou `trace.` antes de chamar os predicados.

