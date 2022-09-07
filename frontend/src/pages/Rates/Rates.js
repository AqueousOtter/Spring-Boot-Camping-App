import React from 'react'
import "./Rates.css"

const TENTWEEKDAYRATE = 35
const TENTWEEKENDRATE = 45
const CAMPERWEEKDAYRATE = 55
const CAMPERWEEKENDRATE = 65


export default function Rates() {
  return (
    <div className='rate-section'>
      <div className="rate-content">
      <div className="rate-info">
          <h4>Campground Rates</h4>
          <hr />
          <p className="rate-type">Tent Sites: </p>
          <ul>         <br/>
            <li>${TENTWEEKDAYRATE} weekday</li>         <br/>
            <li>${TENTWEEKENDRATE} weekend</li>
          </ul>
          <p className="rate-type">* limit 2 tents per site. Call us for accommodations.</p>
          <br/>
          <p className="rate-type">Camper/RV:</p>
          <ul>
            <br/>
            <li>${CAMPERWEEKDAYRATE} weekday</li><br/>
            <li>${CAMPERWEEKENDRATE} weekend</li>
          </ul>
          <p className="rate-type">* limit 1 camper or RV per site</p>
          <br /><hr/>
          <p>Any site with more than 4 adults or 4 children will be charged an additional $10 per person, per night.</p>
          Please read our <a href="/">RULES</a> before booking your stay. 
        </div>
        <div className="map-card">
          <img src="./assets/map.jpg" alt="park map" />
          <p><a href="/">download park map</a></p>
        </div>



      </div>
    </div>
  )
}
