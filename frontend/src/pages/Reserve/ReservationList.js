import React from 'react'
import './ReservationList.css'
export default function ReservationList({reservations}) {
  return (
    
      <div className="reservation-list ">
        <table className='table table-striped table-hover'>
          <thead className='thead'>
            <tr>
                <th>Site Number</th>
                <th>Arrival</th>
                <th>Departure</th>
                <th>asda</th>
            </tr>
            </thead>
            <tbody>
              {reservations.map(reservation => (

                  <tr key={reservation.siteNumber}>
                      <td>{reservation.siteNumber}</td>
                      <td>{reservation.startDate}</td>
                      <td>{reservation.endDate}</td>
                      <td>ass</td>
                  </tr>
          
          ))}
          </tbody>
          </table>



      </div>

  )
}
