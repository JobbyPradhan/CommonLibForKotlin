fun getCashSuggestions(cost: Int): List<Int> {
    val denominations = listOf(50, 100, 200, 500, 1000, 5000, 10000) // replace any currency denomination
    val suggestions = mutableSetOf<Int>()
    suggestions.add(cost)  // Always include the exact cost
    
    val mod1000 = cost % 1000
        if (mod1000 > 700 && mod1000 <= 800) {
            suggestions.add(cost + (900 - mod1000))// Ensure 701-800 → 900
        }
    // Add the next multiple of each denomination if greater than cost
    for (denomination in denominations) {
        // Calculate the next multiple of the denomination that is >= cost
        val nextMultiple = ((cost + denomination - 1) / denomination) * denomination
        if (nextMultiple > cost) {
            suggestions.add(nextMultiple)
        }
    }
    
    return suggestions.sorted()
}

fun main() {
    val cost1 = 12750
    println("Suggestions for $cost1: ${getCashSuggestions(cost1)}")
    //Suggestions for 12750: [12750, 12800, 12900, 13000, 15000, 20000]
}
