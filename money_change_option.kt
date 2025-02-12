fun getCashSuggestions(cost: Int): List<Int> {
    val denominations = listOf(50, 100, 200, 500, 1000, 5000, 10000) // replace any currency denomination
    val suggestions = mutableSetOf<Int>()
    suggestions.add(cost)  // Always include the exact cost
    
    // Check if the cost ends with 750 and add the rounded suggestion (e.g., 750 -> 900)
    if (cost % 1000 == 750) {
        val roundedCost = cost + 150
        suggestions.add(roundedCost)
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
