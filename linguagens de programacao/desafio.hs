-- Definição do tipo Nat
data Nat = Zero | Suc Nat deriving (Show)

-- Exemplos de números de 1 a 4
natOne   = Suc Zero         -- Representa 1
natTwo   = Suc (Suc Zero)   -- Representa 2
natThree = Suc (Suc (Suc Zero)) -- Representa 3
natFour  = Suc (Suc (Suc (Suc Zero))) -- Representa 4

-- Função para converter Nat para Integer
nat2integer :: Nat -> Integer
nat2integer Zero     = 0
nat2integer (Suc n)  = 1 + nat2integer n

-- Função para converter Integer para Nat
integer2nat :: Integer -> Nat
integer2nat 0 = Zero
integer2nat n = Suc (integer2nat (n - 1))

-- Função para adicionar dois números Nat
natAdd :: Nat -> Nat -> Nat
natAdd Zero n = n
natAdd (Suc m) n = Suc (natAdd m n)

-- Função para subtrair dois números Nat
natSub :: Nat -> Nat -> Nat
natSub n Zero = n
natSub Zero _ = Zero
natSub (Suc n) (Suc m) = natSub n m

-- Função para multiplicar dois números Nat
natMul :: Nat -> Nat -> Nat
natMul Zero _ = Zero
natMul (Suc n) m = natAdd m (natMul n m)