import React from 'react'
import './ReservationList.css'
export default function ReservationList({reservations}) {
  return (
    
      <div className="reservation-list container">
        <table className='table table-striped table-hover'>
          <thead className='thead'>
            <tr>
                <th>Site Number</th>
                <th>Arrival</th>
                <th>Departure</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
              {reservations.map(reservation => (

                  <tr key={reservation.siteNumber}>
                      <td>{reservation.siteNumber}</td>
                      <td>{reservation.startDate}</td>
                      <td>{reservation.endDate}</td>
                      <td></td>
                  </tr>
          
          ))}
          </tbody>
          </table>



      </div>

  )
}
