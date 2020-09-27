$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Existing_Car_Details.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate existing Used Car listing",
  "description": "",
  "id": "acceptance-testing-to-validate-existing-used-car-listing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@existing-usedcar-page"
    }
  ]
});
formatter.before({
  "duration": 5745071600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To validate existing Used Car listing",
  "description": "",
  "id": "acceptance-testing-to-validate-existing-used-car-listing;to-validate-existing-used-car-listing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@existing-used-cars-Positive"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the Home Page \"https://www.tmsandbox.co.nz/\"  of TradeMe website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I move to Motors tab",
  "rows": [
    {
      "cells": [
        "Marketplace"
      ],
      "line": 8
    },
    {
      "cells": [
        "Jobs"
      ],
      "line": 9
    },
    {
      "cells": [
        "Motors"
      ],
      "line": 10
    },
    {
      "cells": [
        "Property"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on \"Motors\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "The Page Title should be \"TRADEME SANDBOX - Buy online and sell with NZ\u0027s #1 auction \u0026 classifieds site | Trade Me SANDBOX\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on \"Used cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on used cars result item",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on the existing car",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see the details of the existing car",
  "rows": [
    {
      "cells": [
        "Attributes",
        "Values"
      ],
      "line": 18
    },
    {
      "cells": [
        "Number plate",
        "EDD369"
      ],
      "line": 19
    },
    {
      "cells": [
        "Kilometres",
        "163,794km"
      ],
      "line": 20
    },
    {
      "cells": [
        "Body",
        "Dark Blue, 4 door, Sedan"
      ],
      "line": 21
    },
    {
      "cells": [
        "Seats",
        "5"
      ],
      "line": 22
    },
    {
      "cells": [
        "Fuel type",
        "Petrol"
      ],
      "line": 23
    },
    {
      "cells": [
        "Engine",
        "6 cylinder, 28cc"
      ],
      "line": 24
    },
    {
      "cells": [
        "Transmission",
        "Tiptronic"
      ],
      "line": 25
    },
    {
      "cells": [
        "History",
        "5+ owners, Imported"
      ],
      "line": 26
    },
    {
      "cells": [
        "Registration expires",
        "Sep 2021"
      ],
      "line": 27
    },
    {
      "cells": [
        "WoF expires",
        "Jan 2021"
      ],
      "line": 28
    },
    {
      "cells": [
        "Model detail",
        "E46"
      ],
      "line": 29
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.tmsandbox.co.nz/",
      "offset": 23
    }
  ],
  "location": "TestCase3_Steps.i_am_on_the_Home_Page_of_TradeMe_website(String)"
});
formatter.result({
  "duration": 4239364500,
  "status": "passed"
});
formatter.match({
  "location": "TestCase3_Steps.i_move_to_Motors_tab(DataTable)"
});
formatter.result({
  "duration": 1613500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Motors",
      "offset": 10
    }
  ],
  "location": "TestCase3_Steps.click_on_tab(String)"
});
formatter.result({
  "duration": 135682200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TRADEME SANDBOX - Buy online and sell with NZ\u0027s #1 auction \u0026 classifieds site | Trade Me SANDBOX",
      "offset": 26
    }
  ],
  "location": "TestCase3_Steps.the_Page_Title_should_be(String)"
});
formatter.result({
  "duration": 19691000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used cars",
      "offset": 10
    }
  ],
  "location": "TestCase3_Steps.click_on_link(String)"
});
formatter.result({
  "duration": 2357279100,
  "status": "passed"
});
formatter.match({
  "location": "TestCase3_Steps.click_on_used_cars_result_item()"
});
formatter.result({
  "duration": 3129413800,
  "status": "passed"
});
formatter.match({
  "location": "TestCase3_Steps.click_on_the_existing_car()"
});
formatter.result({
  "duration": 1717535500,
  "status": "passed"
});
formatter.match({
  "location": "TestCase3_Steps.i_should_see_the_details_of_the_existing_car(DataTable)"
});
formatter.result({
  "duration": 569622800,
  "status": "passed"
});
formatter.after({
  "duration": 4936614000,
  "status": "passed"
});
});