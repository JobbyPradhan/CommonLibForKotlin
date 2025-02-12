feat: Add cash suggestion generator for given cost

- Added logic to generate cash suggestions for a given cost, including:
  - Exact cost.
  - Rounded cost for amounts ending with 750 (e.g., 750 -> 900).
  - Next multiples of denominations (50, 100, 200, 500, 1000, 5000, 10000).
- Ensured suggestions include combinations of denominations (e.g., 500 + 200 + 200 = 900).
- Sorted suggestions in ascending order for better readability.
- Added a fun subtext to credit the author (Jobby Pradhan 😂).
