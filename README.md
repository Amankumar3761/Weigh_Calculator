# Weight Calculator CLI (Java)

A lightweight Java command-line application that calculates weight (in kilograms and grams) based on a total monetary amount and the rate per kilogram.

## Features
* **Accurate Decimal Rounding:** Uses precise rounding on total grams to avoid floating-point drift and boundary bugs (e.g., prevents outputs like `1 kg 1000.00 gram`).
* **Input Validation:** Interactive prompts guard against zero/negative rates, negative amounts, and non-numeric inputs.
* **Formatted Output:** Automatically splits output into `X kg Y gram` or `Y gram` for quantities under 1 kg.

## How to Run

1. **Compile:**
   ```bash
   javac WeighCalc.java
