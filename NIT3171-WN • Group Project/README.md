# Retail Data Cleaning and Exploratory Analysis

This project demonstrates a standard data preprocessing pipeline using **Python** and **Pandas**. It focuses on identifying, quantifying, and resolving missing data issues within a retail dataset containing customer tenure, spending scores, and subscription status.

---

## Project Overview

The goal of this project is to transform a "dirty" dataset containing various null values into a clean, analysis-ready format. I have implemented multiple data cleaning strategies to demonstrate the trade-offs between data deletion and data imputation.

## Key Features

* **Initial Data Audit:** Identifying null values across categorical and numerical columns using `.isnull()`.
* **Descriptive Statistics:** Analyzing the distribution of `Tenure` and `SpendScore`.
* **Multiple Imputation Strategies:**
* **Deletion:** Removing rows with any missing values.
* **Constant Imputation:** Filling nulls with default values like `0` or `"Unknown"`.
* **Statistical Imputation:** Applying **Mean**, **Median**, and **Mode** to maintain the statistical integrity of the dataset.
* **Sequential Filling:** Using **Forward Fill (ffill)** for categorical consistency in regional data.



---

## Dataset Structure

The dataset consists of the following features:

| Feature | Type | Description |
| --- | --- | --- |
| **Region** | Categorical | The geographical area of the customer (North, West, East) |
| **Tenure** | Numerical | How long the customer has been with the company |
| **SpendScore** | Numerical | A metric representing the customer's spending behavior |
| **Subscribed** | Categorical | Whether the customer has an active subscription (Yes/No) |

---

## Technical Stack

* **Language:** Python 2.7.6 (compatible with 3.x)
* **Library:** Pandas 2.3.3
* **Environment:** Jupyter Notebook / IPython