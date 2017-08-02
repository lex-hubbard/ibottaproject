The Project
---
Your goal is to build a mobile application for the platform of your choice (between iOS and Android), using the provided JSON data for Offers, Retailers, and Store Locations. 

Your work should reflect your experience with the platform selected. You may create an app that does something creative with the data or provide the following screens at a minimum:

* The app should contain, at a minimum, 3 screens. These screens are as follows:
  * A screen containing a list of available retailers
  * A screen containing a list of offers available at a given retailer
  * A screen containing some details for a given offer. You may include whatever details you feel make sense for this screen.
* You can target the latest, or a very recent, version of the operating system. 
* You should assume the app will run on varying screen sizes, excluding tablets. 
* Feel free to pull in any libraries you'd like to assist in the development of your project.
* You do not need to make use of every attribute on every JSON object. Just use whatever you need for your project.
* Parsing the JSON data can be a computationally expensive process. Ensure this is done in a performant manner.
* Loading images can be slow and memory intensive. We will be looking for an efficient and performant solution to this.
* Code should be legible, well formatted and commented.
* The UI/layouts should be as clean as possible.
* We would like to see at least one automated test written.
* The project should be considered complete when you feel like you could comfortably present it as a proof of concept app to people within a company you are working for.

Notes on the Data Provided:

 * Offers.json contains Offer objects. Each Offer contains details about itself such as description, amounts, etc. Offers have an attribute, "retailers", which relate to the Retailers they are available at.
 * Retailers.json describe general information about a store where an Offer will be available, such as its name, image asset, etc.
 * Store Locations.json give you location data for specific Retailers. For example, Walmart has several physical store locations. Each object in Store Locations.json gives you geolocation data for a physical store, and what Retailer it is referring to.

Deliverable
---
Please provide the code for the assignment either in a private repository (GitHub or Bitbucket) or as a zip file.
