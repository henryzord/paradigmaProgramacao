% define proposições: afirmações que são verdadeiras.

casal(henry, juliana).

mae(claudeni, juliana).
mae(claudeni, caroline).
mae(marlene, henry).

pai(fernando, juliana).
pai(fernando, caroline).
pai(luiz, henry).


% define predicados: aceitam variáveis como parâmetro, e não 
% possuem um valor verdadeiro ou falso até que o valor da variável
% seja definido.

% predicados bidirecionais: funcionam independente da ordem dos fatores

casados(X, Y) :- casal(X, Y).
casados(X, Y) :- casal(Y, X).

irmaos(X, Y) :-
    pai(P, X),
    pai(P, Y),
    mae(M, X),
    mae(M, Y),
    X \= Y.

cunhados(X, Y) :-
    casados(X, Z), 
    irmaos(Z, Y).

cunhados(X, Y) :-
    casados(Y, Z), 
    irmaos(Z, X).