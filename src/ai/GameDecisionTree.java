package ai;

public class GameDecisionTree {
    // Pseudocode
    // function ALPHA-BETA-SEARCH(state) returns an action
    //  v ← MAX-VALUE(state, −∞, +∞)
    //  return the action in ACTIONS(state) with value v

    // function MAX-VALUE(state, α, β) returns a utility value
    //  if TERMINAL-TEST(state) the return UTILITY(state)
    //  v ← −∞
    //  for each a in ACTIONS(state) do
    //    v ← MAX(v, MIN-VALUE(RESULT(state, a), α, β))
    //    if v ≥ β then return v
    //    α ← MAX(α, v)
    //  return v

    // function MIN-VALUE(state, α, β) returns a utility value
    //  if TERMINAL-TEST(state) the return UTILITY(state)
    //  v ← +∞
    //  for each a in ACTIONS(state) do
    //    v ← MIN(v, MAX-VALUE(RESULT(state, a), α, β))
    //    if v ≤ α then return v
    //    β ← MIN(β, v)
    //  return v
}
