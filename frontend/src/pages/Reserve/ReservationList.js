import React from 'react'
import './ReservationList.css'
import {useTable} from 'react-table'
export default function ReservationList({reservations}) {


  const columns = [
    {
      Header: 'Site Number',
      accessor: 'siteNumber'
    },{
      Header: 'Arrival',
      accessor: 'startDate'
    },{
      Header: 'Departure',
      accessor: 'endDate'
    },
  ]

  const tableInstance = useTable({
    columns: columns,
    data: reservations
  })

  const {getTableProps, getTableBodyProps, headerGroups, rows, prepareRow} = tableInstance

  return (
    
      <div className="reservation-list ">
        <table {...getTableProps} className='table table-small table-info table-striped table-hover'>
          <thead className='thead'>
            {headerGroups.map((headerGroup) => (
                < tr {...headerGroup.getHeaderGroupProps()}>
                  {headerGroup.headers.map((column) => (
                    <th {...column.getHeaderProps()}>{column.render('Header')}</th>
                  ))}
                 
                </tr>
            ))}

            </thead>
            <tbody {...getTableBodyProps}>
              {rows.map(row => {
                prepareRow(row)
                return(
                  <tr {...row.getRowProps()}>
                    {row.cells.map((cell) =>{
                      return <td {...cell.getCellProps()}>{cell.render('Cell')}</td>
                    })}
                  </tr>
                )
              })}
          
          
          </tbody>
          </table>



      </div>

  )
}
